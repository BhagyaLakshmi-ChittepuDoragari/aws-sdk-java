/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBClusters(DescribeDBClustersRequest) DescribeDBClusters operation}.
 * <p>
 * Returns information about provisioned Aurora DB clusters. This API
 * supports pagination.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBClusters(DescribeDBClustersRequest)
 */
public class DescribeDBClustersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The user-supplied DB cluster identifier. If this parameter is
     * specified, information from only the specific DB cluster is returned.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String dBClusterIdentifier;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusters</a> request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The user-supplied DB cluster identifier. If this parameter is
     * specified, information from only the specific DB cluster is returned.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return The user-supplied DB cluster identifier. If this parameter is
     *         specified, information from only the specific DB cluster is returned.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The user-supplied DB cluster identifier. If this parameter is
     * specified, information from only the specific DB cluster is returned.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBClusterIdentifier The user-supplied DB cluster identifier. If this parameter is
     *         specified, information from only the specific DB cluster is returned.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The user-supplied DB cluster identifier. If this parameter is
     * specified, information from only the specific DB cluster is returned.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The user-supplied DB cluster identifier. If this parameter is
     *         specified, information from only the specific DB cluster is returned.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filters This parameter is not currently supported.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusters</a> request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <a>DescribeDBClusters</a> request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusters</a> request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeDBClusters</a> request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusters</a> request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeDBClusters</a> request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBClustersRequest == false) return false;
        DescribeDBClustersRequest other = (DescribeDBClustersRequest)obj;
        
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBClustersRequest clone() {
        
            return (DescribeDBClustersRequest) super.clone();
    }

}
    