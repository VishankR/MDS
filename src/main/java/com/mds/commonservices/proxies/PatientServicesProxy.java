package com.mds.commonservices.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mds.commonservices.entities.Patient;

@FeignClient(name="PatientServices")
public interface PatientServicesProxy {
	@GetMapping("/")
	public List<Patient> getAllPatients();
}
