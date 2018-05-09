package com.ipartek.formacion.soap.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ipartek.formacion.soap.domain.Alumno;
import com.ipartek.formacion.soap.repository.AlumnoRepository;
import com.ipartek.formacion.web_service_soap.AlumnoInfo;
import com.ipartek.formacion.web_service_soap.GetAlumnoRequest;
import com.ipartek.formacion.web_service_soap.GetAlumnoResponse;


@Endpoint
public class AlumnoEndpoint {
	private static final String NAMESPACE_URI = "http://formacion.ipartek.com/web-service-soap";

	@Autowired
	private AlumnoRepository alumnoRepository;
		
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAlumnoRequest")
	@ResponsePayload
	public GetAlumnoResponse getCountry(@RequestPayload GetAlumnoRequest request) {
		GetAlumnoResponse response = new GetAlumnoResponse();
		
		Alumno a = alumnoRepository.findAlumno(request.getNif());
		AlumnoInfo alumno = new AlumnoInfo();
		alumno.setNif(a.getNif());
		alumno.setNombre(a.getNombre());		
		alumno.setApellidos(a.getApellidos());
		alumno.setEmail(a.getEmail());
		
		response.setAlumnoInfo( alumno );
		return response;
	}
	
	
	
	
}
