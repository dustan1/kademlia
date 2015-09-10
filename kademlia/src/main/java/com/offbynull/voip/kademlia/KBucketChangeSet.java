/*
 * Copyright (c) 2015, Kasra Faghihi, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.offbynull.voip.kademlia;

import java.util.Objects;
import org.apache.commons.lang3.Validate;

public final class KBucketChangeSet {
    private final ActivityChangeSet bucketChangeSet;
    private final ActivityChangeSet cacheChangeSet;

    public KBucketChangeSet(ActivityChangeSet bucketChangeSet, ActivityChangeSet cacheChangeSet) {
        Validate.notNull(bucketChangeSet);
        Validate.notNull(cacheChangeSet);
        this.bucketChangeSet = bucketChangeSet;
        this.cacheChangeSet = cacheChangeSet;
    }

    public ActivityChangeSet getBucketChangeSet() {
        return bucketChangeSet;
    }

    public ActivityChangeSet getCacheChangeSet() {
        return cacheChangeSet;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bucketChangeSet);
        hash = 83 * hash + Objects.hashCode(this.cacheChangeSet);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KBucketChangeSet other = (KBucketChangeSet) obj;
        if (!Objects.equals(this.bucketChangeSet, other.bucketChangeSet)) {
            return false;
        }
        if (!Objects.equals(this.cacheChangeSet, other.cacheChangeSet)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KBucketChangeSet{" + "bucketChangeSet=" + bucketChangeSet + ", cacheChangeSet=" + cacheChangeSet + '}';
    }
    
}
