//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.09 at 02:25:17 PM BST 
//


package rapidFit.rpfit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ObservableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *             &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;/sequence>
 *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservableType", propOrder = {
    "name",
    "minimum",
    "maximum",
    "value",
    "unit",
    "tf1"
})
public class ObservableType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Minimum", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double minimum;
    @XmlElement(name = "Maximum", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double maximum;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "TF1")
    protected String tf1;

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
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimum(Double value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximum(Double value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the tf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTF1() {
        return tf1;
    }

    /**
     * Sets the value of the tf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTF1(String value) {
        this.tf1 = value;
    }

}
