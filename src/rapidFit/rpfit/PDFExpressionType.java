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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ProdPDF" type="{}ProdPDFType"/>
 *         &lt;element name="NormalisedSumPDF" type="{}SumPDFType"/>
 *         &lt;element name="PDF" type="{}PDFType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFExpressionType", propOrder = {
    "prodPDF",
    "normalisedSumPDF",
    "pdf"
})
public class PDFExpressionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProdPDF")
    protected ProdPDFType prodPDF;
    @XmlElement(name = "NormalisedSumPDF")
    protected SumPDFType normalisedSumPDF;
    @XmlElement(name = "PDF")
    protected PDFType pdf;

    /**
     * Gets the value of the prodPDF property.
     * 
     * @return
     *     possible object is
     *     {@link ProdPDFType }
     *     
     */
    public ProdPDFType getProdPDF() {
        return prodPDF;
    }

    /**
     * Sets the value of the prodPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdPDFType }
     *     
     */
    public void setProdPDF(ProdPDFType value) {
        this.prodPDF = value;
    }

    /**
     * Gets the value of the normalisedSumPDF property.
     * 
     * @return
     *     possible object is
     *     {@link SumPDFType }
     *     
     */
    public SumPDFType getNormalisedSumPDF() {
        return normalisedSumPDF;
    }

    /**
     * Sets the value of the normalisedSumPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumPDFType }
     *     
     */
    public void setNormalisedSumPDF(SumPDFType value) {
        this.normalisedSumPDF = value;
    }

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     {@link PDFType }
     *     
     */
    public PDFType getPDF() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFType }
     *     
     */
    public void setPDF(PDFType value) {
        this.pdf = value;
    }

}
