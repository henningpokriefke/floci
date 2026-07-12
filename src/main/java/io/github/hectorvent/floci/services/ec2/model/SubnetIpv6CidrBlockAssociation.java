package io.github.hectorvent.floci.services.ec2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubnetIpv6CidrBlockAssociation {
    private String associationId;
    private String ipv6CidrBlock;
    private String cidrBlockState = "associated";
    private String ipv6AddressAttribute = "public";
    private String ipSource = "amazon";

    public SubnetIpv6CidrBlockAssociation() {}

    public SubnetIpv6CidrBlockAssociation(String associationId, String ipv6CidrBlock) {
        this.associationId = associationId;
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public String getAssociationId() { return associationId; }
    public void setAssociationId(String associationId) { this.associationId = associationId; }
    public String getIpv6CidrBlock() { return ipv6CidrBlock; }
    public void setIpv6CidrBlock(String ipv6CidrBlock) { this.ipv6CidrBlock = ipv6CidrBlock; }
    public String getCidrBlockState() { return cidrBlockState; }
    public void setCidrBlockState(String cidrBlockState) { this.cidrBlockState = cidrBlockState; }
    public String getIpv6AddressAttribute() { return ipv6AddressAttribute; }
    public void setIpv6AddressAttribute(String ipv6AddressAttribute) { this.ipv6AddressAttribute = ipv6AddressAttribute; }
    public String getIpSource() { return ipSource; }
    public void setIpSource(String ipSource) { this.ipSource = ipSource; }
}
