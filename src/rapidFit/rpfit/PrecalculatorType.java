//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.15 at 10:22:38 AM BST 
//


package rapidFit.rpfit;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecalculatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecalculatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WeightName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Config" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="OutputFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UseAlpha" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecalculatorType", propOrder = {
    "name",
    "weightName",
    "config",
    "outputFile",
    "useAlpha"
})
public class PrecalculatorType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "WeightName", required = true)
    protected String weightName;
    @XmlElement(name = "Config", required = true)
    protected BigInteger config;
    @XmlElement(name = "OutputFile", required = true)
    protected String outputFile;
    @XmlElement(name = "UseAlpha")
    protected Boolean useAlpha;

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
     * Gets the value of the weightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightName() {
        return weightName;
    }

    /**
     * Sets the value of the weightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightName(String value) {
        this.weightName = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfig(BigInteger value) {
        this.config = value;
    }

    /**
     * Gets the value of the outputFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFile() {
        return outputFile;
    }

    /**
     * Sets the value of the outputFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFile(String value) {
        this.outputFile = value;
    }

    /**
     * Gets the value of the useAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAlpha() {
        return useAlpha;
    }

    /**
     * Sets the value of the useAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAlpha(Boolean value) {
        this.useAlpha = value;
    }

}
