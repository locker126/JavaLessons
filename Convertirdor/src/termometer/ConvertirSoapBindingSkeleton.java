/**
 * ConvertirSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package termometer;

public class ConvertirSoapBindingSkeleton implements termometer.Convertir, org.apache.axis.wsdl.Skeleton {
    private termometer.Convertir impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termometer", "farenheit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("farenheitToCelsius", _params, new javax.xml.namespace.QName("http://termometer", "farenheitToCelsiusReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://termometer", "farenheitToCelsius"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("farenheitToCelsius") == null) {
            _myOperations.put("farenheitToCelsius", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("farenheitToCelsius")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termometer", "celsius"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("celsiusToFarenheit", _params, new javax.xml.namespace.QName("http://termometer", "celsiusToFarenheitReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://termometer", "celsiusToFarenheit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("celsiusToFarenheit") == null) {
            _myOperations.put("celsiusToFarenheit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("celsiusToFarenheit")).add(_oper);
    }

    public ConvertirSoapBindingSkeleton() {
        this.impl = new termometer.ConvertirSoapBindingImpl();
    }

    public ConvertirSoapBindingSkeleton(termometer.Convertir impl) {
        this.impl = impl;
    }
    public float farenheitToCelsius(float farenheit) throws java.rmi.RemoteException
    {
        float ret = impl.farenheitToCelsius(farenheit);
        return ret;
    }

    public float celsiusToFarenheit(float celsius) throws java.rmi.RemoteException
    {
        float ret = impl.celsiusToFarenheit(celsius);
        return ret;
    }

}
