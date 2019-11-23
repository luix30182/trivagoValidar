/*
 * An XML document type.
 * Localname: requestValidar
 * Namespace: http://validar.com
 * Java type: com.validar.RequestValidarDocument
 *
 * Automatically generated - do not modify.
 */
package com.validar.impl;
/**
 * A document containing one requestValidar(@http://validar.com) element.
 *
 * This is a complex type.
 */
public class RequestValidarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.validar.RequestValidarDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestValidarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTVALIDAR$0 = 
        new javax.xml.namespace.QName("http://validar.com", "requestValidar");
    
    
    /**
     * Gets the "requestValidar" element
     */
    public com.validar.RequestValidarDocument.RequestValidar getRequestValidar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.validar.RequestValidarDocument.RequestValidar target = null;
            target = (com.validar.RequestValidarDocument.RequestValidar)get_store().find_element_user(REQUESTVALIDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestValidar" element
     */
    public void setRequestValidar(com.validar.RequestValidarDocument.RequestValidar requestValidar)
    {
        generatedSetterHelperImpl(requestValidar, REQUESTVALIDAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestValidar" element
     */
    public com.validar.RequestValidarDocument.RequestValidar addNewRequestValidar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.validar.RequestValidarDocument.RequestValidar target = null;
            target = (com.validar.RequestValidarDocument.RequestValidar)get_store().add_element_user(REQUESTVALIDAR$0);
            return target;
        }
    }
    /**
     * An XML requestValidar(@http://validar.com).
     *
     * This is a complex type.
     */
    public static class RequestValidarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.validar.RequestValidarDocument.RequestValidar
    {
        private static final long serialVersionUID = 1L;
        
        public RequestValidarImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDHABITACION$0 = 
            new javax.xml.namespace.QName("http://validar.com", "idHabitacion");
        private static final javax.xml.namespace.QName FECHA$2 = 
            new javax.xml.namespace.QName("http://validar.com", "fecha");
        
        
        /**
         * Gets the "idHabitacion" element
         */
        public int getIdHabitacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDHABITACION$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "idHabitacion" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdHabitacion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDHABITACION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idHabitacion" element
         */
        public void setIdHabitacion(int idHabitacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDHABITACION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDHABITACION$0);
                }
                target.setIntValue(idHabitacion);
            }
        }
        
        /**
         * Sets (as xml) the "idHabitacion" element
         */
        public void xsetIdHabitacion(org.apache.xmlbeans.XmlInt idHabitacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDHABITACION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDHABITACION$0);
                }
                target.set(idHabitacion);
            }
        }
        
        /**
         * Gets the "fecha" element
         */
        public java.lang.String getFecha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fecha" element
         */
        public org.apache.xmlbeans.XmlString xgetFecha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHA$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fecha" element
         */
        public void setFecha(java.lang.String fecha)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHA$2);
                }
                target.setStringValue(fecha);
            }
        }
        
        /**
         * Sets (as xml) the "fecha" element
         */
        public void xsetFecha(org.apache.xmlbeans.XmlString fecha)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHA$2);
                }
                target.set(fecha);
            }
        }
    }
}
