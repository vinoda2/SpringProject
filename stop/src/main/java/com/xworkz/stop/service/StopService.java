package com.xworkz.stop.service;

import com.xworkz.stop.dto.StopDTO;

public interface StopService {

	boolean validateAndSave(StopDTO dto);
}
