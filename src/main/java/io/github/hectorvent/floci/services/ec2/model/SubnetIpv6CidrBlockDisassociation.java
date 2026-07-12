package io.github.hectorvent.floci.services.ec2.model;

public record SubnetIpv6CidrBlockDisassociation(
        String subnetId,
        SubnetIpv6CidrBlockAssociation association) {}
