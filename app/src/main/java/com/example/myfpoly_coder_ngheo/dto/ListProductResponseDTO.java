package com.example.myfpoly_coder_ngheo.dto;

import java.util.List;

public class ListProductResponseDTO {
    private boolean status;
    private String message;
    private List<ProductsResponseDTO> data;

    public ListProductResponseDTO() {
    }

    public ListProductResponseDTO(boolean status, String message, List<ProductsResponseDTO> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ProductsResponseDTO> getData() {
        return data;
    }

    public void setData(List<ProductsResponseDTO> data) {
        this.data = data;
    }
}
