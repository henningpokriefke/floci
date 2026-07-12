package io.github.hectorvent.floci.services.ec2.model;

public record VpcCidrBlockDisassociation(
        String vpcId,
        VpcCidrBlockAssociation ipv4Association,
        VpcIpv6CidrBlockAssociation ipv6Association) {}
