package com.matheuspierro.EksClusterCICD.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.eks.AmazonEKS;
import com.amazonaws.services.eks.AmazonEKSClientBuilder;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

    @Bean
    public AmazonEKS amazonEKS() {
        Dotenv dotenv = Dotenv.load();
        String awsAccessKey = dotenv.get("AWS_ACCESS_KEY_ID");
        String awsSecretKey = dotenv.get("AWS_SECRET_ACCESS_KEY");

        return AmazonEKSClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey, awsSecretKey)))
                .withRegion(Regions.SA_EAST_1)
                .build();
    }
}