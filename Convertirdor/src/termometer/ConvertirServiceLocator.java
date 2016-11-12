/**
 * ConvertirServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package termometer;

public class ConvertirServiceLocator extends org.apache.axis.client.Service implements termometer.ConvertirService {

    public ConvertirServiceLocator() {
    }


    public ConvertirServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConvertirServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Convertir
    private java.lang.String Convertir_address = "http://tempuri.org/JAXWS/services/Convertir";

    public java.lang.String getConvertirAddress() {
        return Convertir_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConvertirWSDDServiceName = "Convertir";

    public java.lang.String getConvertirWSDDServiceName() {
        return ConvertirWSDDServiceName;
    }

    public void setConvertirWSDDServiceName(java.lang.String name) {
        ConvertirWSDDServiceName = name;
    }

    public termometer.Convertir getConvertir() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Convertir_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConvertir(endpoint);
    }

    public termometer.Convertir getConvertir(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            termometer.ConvertirSoapBindingStub _stub = new termometer.ConvertirSoapBindingStub(portAddress, this);
            _stub.setPortName(getConvertirWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConvertirEndpointAddress(java.lang.String address) {
        Convertir_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (termometer.Convertir.class.isAssignableFrom(serviceEndpointInterface)) {
                termometer.ConvertirSoapBindingStub _stub = new termometer.ConvertirSoapBindingStub(new java.net.URL(Convertir_address), this);
                _stub.setPortName(getConvertirWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Convertir".equals(inputPortName)) {
            return getConvertir();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://termometer", "ConvertirService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://termometer", "Convertir"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Convertir".equals(portName)) {
            setConvertirEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
