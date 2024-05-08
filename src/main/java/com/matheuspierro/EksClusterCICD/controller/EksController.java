package com.matheuspierro.EksClusterCICD.controller;

import com.matheuspierro.EksClusterCICD.service.EksManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eks")
public class EksController {

    @Autowired
    private EksManagementService eksService;

    @PostMapping("/create")
    public String createCluster(@RequestParam String name, @RequestParam String roleArn, @RequestParam String subnetIds, @RequestParam String securityGroupIds) {
        return eksService.createCluster(name, roleArn, subnetIds, securityGroupIds);
    }
}
