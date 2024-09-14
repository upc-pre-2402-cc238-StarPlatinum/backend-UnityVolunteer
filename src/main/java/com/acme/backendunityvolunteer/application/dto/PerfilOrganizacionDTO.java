package com.acme.backendunityvolunteer.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilOrganizacionDTO {
    private Long id;
    private Long usuarioId;
    private String nombreOrganizacion;
    private String tipoOrganizacion;
    private String sitioWeb;
}