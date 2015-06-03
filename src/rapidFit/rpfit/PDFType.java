//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 01:03:51 PM BST 
//


package rapidFit.rpfit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObservableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppendAllOthers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FractionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterSubstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppendParameterNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationParameter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFType", propOrder = {
    "name",
    "label",
    "observableName",
    "parameterName",
    "appendAllOthers",
    "fractionName",
    "parameterSubstitution",
    "appendParameterNames",
    "configurationParameter"
})
public class PDFType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "ObservableName")
    protected String observableName;
    @XmlElement(name = "ParameterName")
    protected String parameterName;
    @XmlElement(name = "AppendAllOthers")
    protected String appendAllOthers;
    @XmlElement(name = "FractionName")
    protected String fractionName;
    @XmlElement(name = "ParameterSubstitution")
    protected String parameterSubstitution;
    @XmlElement(name = "AppendParameterNames")
    protected String appendParameterNames;
    @XmlElement(name = "ConfigurationParameter")
    protected List<String> configurationParameter;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the observableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservableName() {
        return observableName;
    }

    /**
     * Sets the value of the observableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservableName(String value) {
        this.observableName = value;
    }

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterName(String value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the appendAllOthers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendAllOthers() {
        return appendAllOthers;
    }

    /**
     * Sets the value of the appendAllOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendAllOthers(String value) {
        this.appendAllOthers = value;
    }

    /**
     * Gets the value of the fractionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFractionName() {
        return fractionName;
    }

    /**
     * Sets the value of the fractionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFractionName(String value) {
        this.fractionName = value;
    }

    /**
     * Gets the value of the parameterSubstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterSubstitution() {
        return parameterSubstitution;
    }

    /**
     * Sets the value of the parameterSubstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterSubstitution(String value) {
        this.parameterSubstitution = value;
    }

    /**
     * Gets the value of the appendParameterNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendParameterNames() {
        return appendParameterNames;
    }

    /**
     * Sets the value of the appendParameterNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendParameterNames(String value) {
        this.appendParameterNames = value;
    }

    /**
     * Gets the value of the configurationParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfigurationParameter() {
        if (configurationParameter == null) {
            configurationParameter = new ArrayList<String>();
        }
        return this.configurationParameter;
    }

}
