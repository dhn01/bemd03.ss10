package com.example.ss10.wrappers;

public class ApiResponse<T> {
    private String status;
    private String code;
    private T data;
    private PageInfo meta;
}
