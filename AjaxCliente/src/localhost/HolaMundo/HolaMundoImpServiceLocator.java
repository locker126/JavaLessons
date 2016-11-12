/**
 * HolaMundoImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.HolaMundo;

public class HolaMundoImpServiceLocator extends org.apache.axis.client.Service implements localhost.HolaMundo.HolaMundoImpService {

    public HolaMundoImpServiceLocator() {
    }


    public HolaMundoImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolaMundoImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolaMundoImpPort
    private java.lang.String HolaMundoImpPort_address = "http://localhost:8080/HolaMundo";

    public java.lang.String getHolaMundoImpPortAddress() {
        return HolaMundoImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolaMundoImpPortWSDDServiceName = "HolaMundoImpPort";

    public java.lang.String getHolaMundoImpPortWSDDServiceName() {
        return HolaMundoImpPortWSDDServiceName;
    }

    public void setHolaMundoImpPortWSDDServiceName(java.lang.String name) {
        HolaMundoImpPortWSDDServiceName = name;
    }

    public ws1.HelloWorld getHolaMundoImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolaMundoImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolaMundoImpPort(endpoint);
    }

    public ws1.HelloWorld getHolaMundoImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.HolaMundo.HolaMundoImpPortBindingStub _stub = new localhost.HolaMundo.HolaMundoImpPortBindingStub(portAddress, this);
            _stub.setPortName(getHolaMundoImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolaMundoImpPortEndpointAddress(java.lang.String address) {
        HolaMundoImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws1.HelloWorld.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.HolaMundo.HolaMundoImpPortBindingStub _stub = new localhost.HolaMundo.HolaMundoImpPortBindingStub(new java.net.URL(HolaMundoImpPort_address), this);
                _stub.setPortName(getHolaMundoImpPortWSDDServiceName());
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
        if ("HolaMundoImpPort".equals(inputPortName)) {
            return getHolaMundoImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/HolaMundo", "HolaMundoImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/HolaMundo", "HolaMundoImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolaMundoImpPort".equals(portName)) {
            setHolaMundoImpPortEndpointAddress(address);
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
