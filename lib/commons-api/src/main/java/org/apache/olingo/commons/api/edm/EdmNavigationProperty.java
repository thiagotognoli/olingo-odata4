/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.commons.api.edm;

import java.util.List;

/**
 * A CSDL NavigationProperty element
 * <br/>
 * EdmNavigationProperty allows navigation from one entity type to another via a relationship.
 */
public interface EdmNavigationProperty extends EdmElement, EdmAnnotatable {

  @Override
  EdmEntityType getType();

  /**
   * @return true if nullable or not specified
   */
  boolean isNullable();

  /**
   * @return true if containsTarget
   */
  boolean containsTarget();

  /**
   * @return the partner navigation property
   */
  EdmNavigationProperty getPartner();

  /**
   * Get property name for referenced property
   *
   * @param referencedPropertyName name of referenced property
   * @return propertyName for this referenced property
   */
  String getReferencingPropertyName(String referencedPropertyName);

  /**
   * @return all referential constraints for this navigation property.
   */
  List<EdmReferentialConstraint> getReferentialConstraints();
  
  EdmOnDelete getOnDelete();

  /**
   * @return true if the entity set allows for the next segment to be the key.
   */
  boolean isKeyAsSegmentAllowed();

}
