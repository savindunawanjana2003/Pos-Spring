package org.example.posbackend.Util2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/18/26 10:06 AM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIRespons<T> {
    private  int status;
    private  String message;
    private  T data;
}
