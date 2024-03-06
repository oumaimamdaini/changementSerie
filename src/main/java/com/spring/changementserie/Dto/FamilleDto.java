package com.spring.changementserie.Dto;

import com.spring.changementserie.Models.Famille;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FamilleDto {
    private Integer idFamilleDto;
    private String nomFamilleDto;
    public static FamilleDto fromEntity(Famille famille){
        if(famille==null){
            return null;}

    return FamilleDto.builder()
            .idFamilleDto(famille.getIdFamille())
            .nomFamilleDto(famille.getNomFamille())
            .build();
}
    public static Famille toEntity(FamilleDto familleDto) {
        if (familleDto == null) {
            return null;
        }
        Famille famille = new Famille();
        famille.setIdFamille(familleDto.getIdFamilleDto());
        famille.setNomFamille(familleDto.getNomFamilleDto());
        return famille;
    }


}
