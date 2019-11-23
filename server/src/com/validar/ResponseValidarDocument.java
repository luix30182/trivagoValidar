/*
 * An XML document type.
 * Localname: responseValidar
 * Namespace: http://validar.com
 * Java type: com.validar.ResponseValidarDocument
 *
 * Automatically generated - do not modify.
 */
package com.validar;


/**
 * A document containing one responseValidar(@http://validar.com) element.
 *
 * This is a complex type.
 */
public interface ResponseValidarDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseValidarDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4C3F22DEC1AB5EF6D2D76F8A4E1850B1").resolveHandle("responsevalidar5d3bdoctype");
    
    /**
     * Gets the "responseValidar" element
     */
    com.validar.ResponseValidarDocument.ResponseValidar getResponseValidar();
    
    /**
     * Sets the "responseValidar" element
     */
    void setResponseValidar(com.validar.ResponseValidarDocument.ResponseValidar responseValidar);
    
    /**
     * Appends and returns a new empty "responseValidar" element
     */
    com.validar.ResponseValidarDocument.ResponseValidar addNewResponseValidar();
    
    /**
     * An XML responseValidar(@http://validar.com).
     *
     * This is a complex type.
     */
    public interface ResponseValidar extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseValidar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4C3F22DEC1AB5EF6D2D76F8A4E1850B1").resolveHandle("responsevalidara223elemtype");
        
        /**
         * Gets the "ack" element
         */
        com.validar.ResponseValidarDocument.ResponseValidar.Ack getAck();
        
        /**
         * Sets the "ack" element
         */
        void setAck(com.validar.ResponseValidarDocument.ResponseValidar.Ack ack);
        
        /**
         * Appends and returns a new empty "ack" element
         */
        com.validar.ResponseValidarDocument.ResponseValidar.Ack addNewAck();
        
        /**
         * An XML ack(@http://validar.com).
         *
         * This is a complex type.
         */
        public interface Ack extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ack.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4C3F22DEC1AB5EF6D2D76F8A4E1850B1").resolveHandle("ack698eelemtype");
            
            /**
             * Gets the "code" element
             */
            java.lang.String getCode();
            
            /**
             * Gets (as xml) the "code" element
             */
            org.apache.xmlbeans.XmlString xgetCode();
            
            /**
             * Sets the "code" element
             */
            void setCode(java.lang.String code);
            
            /**
             * Sets (as xml) the "code" element
             */
            void xsetCode(org.apache.xmlbeans.XmlString code);
            
            /**
             * Gets the "description" element
             */
            java.lang.String getDescription();
            
            /**
             * Gets (as xml) the "description" element
             */
            org.apache.xmlbeans.XmlString xgetDescription();
            
            /**
             * Sets the "description" element
             */
            void setDescription(java.lang.String description);
            
            /**
             * Sets (as xml) the "description" element
             */
            void xsetDescription(org.apache.xmlbeans.XmlString description);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.validar.ResponseValidarDocument.ResponseValidar.Ack newInstance() {
                  return (com.validar.ResponseValidarDocument.ResponseValidar.Ack) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.validar.ResponseValidarDocument.ResponseValidar.Ack newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.validar.ResponseValidarDocument.ResponseValidar.Ack) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.validar.ResponseValidarDocument.ResponseValidar newInstance() {
              return (com.validar.ResponseValidarDocument.ResponseValidar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.validar.ResponseValidarDocument.ResponseValidar newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.validar.ResponseValidarDocument.ResponseValidar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.validar.ResponseValidarDocument newInstance() {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.validar.ResponseValidarDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.validar.ResponseValidarDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.validar.ResponseValidarDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.validar.ResponseValidarDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.validar.ResponseValidarDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.validar.ResponseValidarDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.validar.ResponseValidarDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.validar.ResponseValidarDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.validar.ResponseValidarDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.validar.ResponseValidarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.validar.ResponseValidarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.validar.ResponseValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
