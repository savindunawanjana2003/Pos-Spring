package org.example.posbackend.service;

import org.example.posbackend.dto.OderDto;
import org.example.posbackend.dto.OderDeatilesDto;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 8:34 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
public interface PlaceOderServiceInterface {
    public String saveOder(OderDto oder, List<OderDeatilesDto> oderDeatilesDto);
    String getLastOderId();
}
