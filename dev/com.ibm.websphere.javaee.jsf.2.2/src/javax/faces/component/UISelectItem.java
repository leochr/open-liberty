/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package javax.faces.component;

import javax.faces.component.UIComponent;


// Generated from class javax.faces.component._UISelectItem.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class UISelectItem extends javax.faces.component.UIComponentBase
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.SelectItem";
    static public final String COMPONENT_TYPE =
        "javax.faces.SelectItem";

    //BEGIN CODE COPIED FROM javax.faces.component._UISelectItem 
    public void setRendered(boolean state)
    {
        super.setRendered(state);
        // call parent method due TCK problems
        // throw new UnsupportedOperationException();
    }

    protected javax.faces.context.FacesContext getFacesContext()
    {
        //In theory the parent most of the times has 
        //the cached FacesContext instance, because this
        //element is purely logical, and the parent is the one
        //where encodeXXX was invoked. But only limit the
        //search to the closest parent.
        UIComponent parent = getParent();
        if (parent != null && parent.isCachedFacesContext())
        {
            return parent.getFacesContext();
        }
        else
        {
            return super.getFacesContext();
        }
    }


    //END CODE COPIED FROM javax.faces.component._UISelectItem

    public UISelectItem()
    {
        setRendererType(null);
    }

    @Override    
    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }



    
    // Property: value

    public Object getValue()
    {
        return  getStateHelper().eval(PropertyKeys.value);
    }
    
    public void setValue(Object value)
    {
        getStateHelper().put(PropertyKeys.value, value ); 
    }
    // Property: itemDisabled

    public boolean isItemDisabled()
    {
        return (Boolean) getStateHelper().eval(PropertyKeys.itemDisabled, false);
    }
    
    public void setItemDisabled(boolean itemDisabled)
    {
        getStateHelper().put(PropertyKeys.itemDisabled, itemDisabled ); 
    }
    // Property: itemEscaped

    public boolean isItemEscaped()
    {
        return (Boolean) getStateHelper().eval(PropertyKeys.itemEscaped, true);
    }
    
    public void setItemEscaped(boolean itemEscaped)
    {
        getStateHelper().put(PropertyKeys.itemEscaped, itemEscaped ); 
    }
    // Property: itemDescription

    public String getItemDescription()
    {
        return (String) getStateHelper().eval(PropertyKeys.itemDescription);
    }
    
    public void setItemDescription(String itemDescription)
    {
        getStateHelper().put(PropertyKeys.itemDescription, itemDescription ); 
    }
    // Property: itemLabel

    public String getItemLabel()
    {
        return (String) getStateHelper().eval(PropertyKeys.itemLabel);
    }
    
    public void setItemLabel(String itemLabel)
    {
        getStateHelper().put(PropertyKeys.itemLabel, itemLabel ); 
    }
    // Property: itemValue

    public Object getItemValue()
    {
        return  getStateHelper().eval(PropertyKeys.itemValue);
    }
    
    public void setItemValue(Object itemValue)
    {
        getStateHelper().put(PropertyKeys.itemValue, itemValue ); 
    }
    // Property: noSelectionOption

    public boolean isNoSelectionOption()
    {
        return (Boolean) getStateHelper().eval(PropertyKeys.noSelectionOption, false);
    }
    
    public void setNoSelectionOption(boolean noSelectionOption)
    {
        getStateHelper().put(PropertyKeys.noSelectionOption, noSelectionOption ); 
    }


    enum PropertyKeys
    {
         value
        , itemDisabled
        , itemEscaped
        , itemDescription
        , itemLabel
        , itemValue
        , noSelectionOption
    }

 }
