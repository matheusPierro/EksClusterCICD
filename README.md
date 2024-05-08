# EksClusterCICD
 Continuous integration and continuous delivery pipeline using Jenkins that automatically builds, tests and deploys an application to EKS.

## Install Plugins: 
Install the necessary plugins in Jenkins, such as Git, Docker, Kubernetes, and any others you think will be necessary for your project.

## Create a Job in Jenkins
New Job: In Jenkins, create a new job by choosing the "Pipeline" option.
SCM Configuration: Configure Source Code Management (SCM) to point to your Git repository where the Spring Boot project is hosted.

### Next Steps
1. Integration and Delivery
   Continuous Integration: Configure the CI tool so that with each push to the repository, code is built, tested, and Docker images are built and pushed to a container registry.
   Continuous Delivery: Configure the CI tool to automate the deployment of the new image to the EKS cluster whenever a new image is pushed to the container registry.
2. Monitoring and Logs
   Integrate tools like Prometheus for monitoring and ELK Stack for logging to maintain visibility into application health and performance.

3. Documentation
   Write clear documentation about the CI/CD process, including system configuration, use and maintenance steps.

Suggested Tools and Technologies:
AWS CLI: For interaction with AWS.
kubectl: Command-line tool for Kubernetes.
Docker: For building and managing application images.
Helm: To manage and deploy Kubernetes applications.
Jenkins/GitLab CI/GitHub Actions: For CI/CD automation.
Prometheus and Grafana: For monitoring.
ELK Stack: For log management.