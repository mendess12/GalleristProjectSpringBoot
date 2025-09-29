package com.yusufmendes.galleristprojectspringboot.handler;

import com.yusufmendes.galleristprojectspringboot.exception.Exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<E> {

    private Integer status;
    private Exception<E> exception;
}
