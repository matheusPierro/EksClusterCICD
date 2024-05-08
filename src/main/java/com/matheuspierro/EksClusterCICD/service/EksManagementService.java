package com.matheuspierro.EksClusterCICD.service;

import com.amazonaws.services.eks.AmazonEKS;
import com.amazonaws.services.eks.AmazonEKSClientBuilder;
import com.amazonaws.services.eks.model.*;

import org.springframework.stereotype.Service;

@Service
public class EksManagementService {

    public String createCluster(String clusterName, String roleArn, String subnetIds, String securityGroupIds) {
        AmazonEKS eksClient = AmazonEKSClientBuilder.standard()
                .withRegion("us-west-2") // Configurar conforme necessário
                .build();

        CreateClusterRequest request = new CreateClusterRequest()
                .withName(clusterName)
                .withRoleArn(roleArn)
                .withResourcesVpcConfig(new VpcConfigRequest()
                        .withSubnetIds(subnetIds.split(","))
                        .withSecurityGroupIds(securityGroupIds.split(",")));

        CreateClusterResult result = eksClient.createCluster(request);
        return result.getCluster().getArn();  // Retorna o ARN do cluster criado
    }
}
