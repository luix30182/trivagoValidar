/*
 * An XML document type.
 * Localname: responseValidar
 * Namespace: http://validar.com
 * Java type: com.validar.ResponseValidarDocument
 *
 * Automatically generated - do not modify.
 */
package com.validar.impl;
/**
 * A document containing one responseValidar(@http://validar.com) element.
 *
 * This is a complex type.
 */
public class ResponseValidarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.validar.ResponseValidarDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseValidarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEVALIDAR$0 = 
        new javax.xml.namespace.QName("http://validar.com", "responseValidar");
    
    
    /**
     * Gets the "responseValidar" element
     */
    public com.validar.ResponseValidarDocument.ResponseValidar getResponseValidar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.validar.ResponseValidarDocument.ResponseValidar target = null;
            target = (com.validar.ResponseValidarDocument.ResponseValidar)get_store().find_element_user(RESPONSEVALIDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseValidar" element
     */
    public void setResponseValidar(com.validar.ResponseValidarDocument.ResponseValidar responseValidar)
    {
        generatedSetterHelperImpl(responseValidar, RESPONSEVALIDAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseValidar" element
     */
    public com.validar.ResponseValidarDocument.ResponseValidar addNewResponseValidar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.validar.ResponseValidarDocument.ResponseValidar target = null;
            target = (com.validar.ResponseValidarDocument.ResponseValidar)get_store().add_element_user(RESPONSEVALIDAR$0);
            return target;
        }
    }
    /**
     * An XML responseValidar(@http://validar.com).
     *
     * This is a complex type.
     */
    public static class ResponseValidarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.validar.ResponseValidarDocument.ResponseValidar
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseValidarImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACK$0 = 
            new javax.xml.namespace.QName("http://validar.com", "ack");
        
        
        /**
         * Gets the "ack" element
         */
        public com.validar.ResponseValidarDocument.ResponseValidar.Ack getAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.validar.ResponseValidarDocument.ResponseValidar.Ack target = null;
                target = (com.validar.ResponseValidarDocument.ResponseValidar.Ack)get_store().find_element_user(ACK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ack" element
         */
        public void setAck(com.validar.ResponseValidarDocument.ResponseValidar.Ack ack)
        {
            generatedSetterHelperImpl(ack, ACK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ack" element
         */
        public com.validar.ResponseValidarDocument.ResponseValidar.Ack addNewAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.validar.ResponseValidarDocument.ResponseValidar.Ack target = null;
                target = (com.validar.ResponseValidarDocument.ResponseValidar.Ack)get_store().add_element_user(ACK$0);
                return target;
            }
        }
        /**
         * An XML ack(@http://validar.com).
         *
         * This is a complex type.
         */
        public static class AckImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.validar.ResponseValidarDocument.ResponseValidar.Ack
        {
            private static final long serialVersionUID = 1L;
            
            public AckImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CODE$0 = 
                new javax.xml.namespace.QName("http://validar.com", "code");
            private static final javax.xml.namespace.QName DESCRIPTION$2 = 
                new javax.xml.namespace.QName("http://validar.com", "description");
            
            
            /**
             * Gets the "code" element
             */
            public java.lang.String getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "code" element
             */
            public org.apache.xmlbeans.XmlString xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "code" element
             */
            public void setCode(java.lang.String code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                    }
                    target.setStringValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "code" element
             */
            public void xsetCode(org.apache.xmlbeans.XmlString code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
                    }
                    target.set(code);
                }
            }
            
            /**
             * Gets the "description" element
             */
            public java.lang.String getDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "description" element
             */
            public org.apache.xmlbeans.XmlString xgetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "description" element
             */
            public void setDescription(java.lang.String description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                    }
                    target.setStringValue(description);
                }
            }
            
            /**
             * Sets (as xml) the "description" element
             */
            public void xsetDescription(org.apache.xmlbeans.XmlString description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                    }
                    target.set(description);
                }
            }
        }
    }
}
