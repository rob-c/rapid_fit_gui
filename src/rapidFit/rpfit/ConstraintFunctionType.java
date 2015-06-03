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
 * <p>Java class for ConstraintFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalConstraint" type="{}ExternalConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalConstMatrix" type="{}ExternalConstMatrixType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintFunctionType", propOrder = {
    "externalConstraint",
    "externalConstMatrix"
})
public class ConstraintFunctionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExternalConstraint")
    protected List<ExternalConstraintType> externalConstraint;
    @XmlElement(name = "ExternalConstMatrix")
    protected List<ExternalConstMatrixType> externalConstMatrix;

    /**
     * Gets the value of the externalConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalConstraintType }
     * 
     * 
     */
    public List<ExternalConstraintType> getExternalConstraint() {
        if (externalConstraint == null) {
            externalConstraint = new ArrayList<ExternalConstraintType>();
        }
        return this.externalConstraint;
    }

    /**
     * Gets the value of the externalConstMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalConstMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalConstMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalConstMatrixType }
     * 
     * 
     */
    public List<ExternalConstMatrixType> getExternalConstMatrix() {
        if (externalConstMatrix == null) {
            externalConstMatrix = new ArrayList<ExternalConstMatrixType>();
        }
        return this.externalConstMatrix;
    }

}
