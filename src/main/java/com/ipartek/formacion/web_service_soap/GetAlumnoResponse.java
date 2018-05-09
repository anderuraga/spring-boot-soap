//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.09 a las 08:53:39 AM CEST 
//


package com.ipartek.formacion.web_service_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alumnoInfo" type="{http://formacion.ipartek.com/web-service-soap}alumnoInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alumnoInfo"
})
@XmlRootElement(name = "getAlumnoResponse")
public class GetAlumnoResponse {

    @XmlElement(required = true)
    protected AlumnoInfo alumnoInfo;

    /**
     * Obtiene el valor de la propiedad alumnoInfo.
     * 
     * @return
     *     possible object is
     *     {@link AlumnoInfo }
     *     
     */
    public AlumnoInfo getAlumnoInfo() {
        return alumnoInfo;
    }

    /**
     * Define el valor de la propiedad alumnoInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlumnoInfo }
     *     
     */
    public void setAlumnoInfo(AlumnoInfo value) {
        this.alumnoInfo = value;
    }

}
