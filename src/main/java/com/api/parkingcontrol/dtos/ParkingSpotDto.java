package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber; //numero da vaga (pode ter letra e numero)
    @NotBlank //nao pode ser nulo, nem vazio
    @Size(max = 7)
    private String licensePlateCar; //placa do carro
    @NotBlank
    private String brandCar; //marca do carro
    @NotBlank
    private String modelCar; //modelo do carro
    @NotBlank
    private String colorCar; //cor do carro
    @NotBlank
    private String responsibleName; //nome do responsável
    @NotBlank
    private String apartment; //apartamento (pode ter letra e numero)
    @NotBlank
    private String block; //bloco ou torre

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
