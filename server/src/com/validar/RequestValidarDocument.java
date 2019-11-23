/*
 * An XML document type.
 * Localname: requestValidar
 * Namespace: http://validar.com
 * Java type: com.validar.RequestValidarDocument
 *
 * Automatically generated - do not modify.
 */
package com.validar;


/**
 * A document containing one requestValidar(@http://validar.com) element.
 *
 * This is a complex type.
 */
public interface RequestValidarDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestValidarDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4C3F22DEC1AB5EF6D2D76F8A4E1850B1").resolveHandle("requestvalidard677doctype");
    
    /**
     * Gets the "requestValidar" element
     */
    com.validar.RequestValidarDocument.RequestValidar getRequestValidar();
    
    /**
     * Sets the "requestValidar" element
     */
    void setRequestValidar(com.validar.RequestValidarDocument.RequestValidar requestValidar);
    
    /**
     * Appends and returns a new empty "requestValidar" element
     */
    com.validar.RequestValidarDocument.RequestValidar addNewRequestValidar();
    
    /**
     * An XML requestValidar(@http://validar.com).
     *
     * This is a complex type.
     */
    public interface RequestValidar extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestValidar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4C3F22DEC1AB5EF6D2D76F8A4E1850B1").resolveHandle("requestvalidare3b1elemtype");
        
        /**
         * Gets the "idHabitacion" element
         */
        int getIdHabitacion();
        
        /**
         * Gets (as xml) the "idHabitacion" element
         */
        org.apache.xmlbeans.XmlInt xgetIdHabitacion();
        
        /**
         * Sets the "idHabitacion" element
         */
        void setIdHabitacion(int idHabitacion);
        
        /**
         * Sets (as xml) the "idHabitacion" element
         */
        void xsetIdHabitacion(org.apache.xmlbeans.XmlInt idHabitacion);
        
        /**
         * Gets the "fecha" element
         */
        java.lang.String getFecha();
        
        /**
         * Gets (as xml) the "fecha" element
         */
        org.apache.xmlbeans.XmlString xgetFecha();
        
        /**
         * Sets the "fecha" element
         */
        void setFecha(java.lang.String fecha);
        
        /**
         * Sets (as xml) the "fecha" element
         */
        void xsetFecha(org.apache.xmlbeans.XmlString fecha);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.validar.RequestValidarDocument.RequestValidar newInstance() {
              return (com.validar.RequestValidarDocument.RequestValidar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.validar.RequestValidarDocument.RequestValidar newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.validar.RequestValidarDocument.RequestValidar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.validar.RequestValidarDocument newInstance() {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.validar.RequestValidarDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.validar.RequestValidarDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.validar.RequestValidarDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.validar.RequestValidarDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.validar.RequestValidarDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.validar.RequestValidarDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.validar.RequestValidarDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.validar.RequestValidarDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.validar.RequestValidarDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.validar.RequestValidarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.validar.RequestValidarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.validar.RequestValidarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
