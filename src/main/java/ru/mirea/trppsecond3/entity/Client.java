package ru.mirea.trppsecond3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** Сущность Клиента. */
@Getter
@Setter
@ToString
public class Client {

    /** Идентификатор. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** Имя. */
    @JsonProperty("firstName")
    @CsvBindByName(column = "first_name")
    private String firstName;
    /** Фамилия. */
    @JsonProperty("lastName")
    @CsvBindByName(column = "last_name")
    private String lastName;
    /** email. */
    @JsonProperty("email")
    @CsvBindByName(column = "email")
    private String email;
    /** Пол. */
    @JsonProperty("gender")
    @CsvBindByName(column = "gender")
    private String gender;
    /** Контактный телефон. */
    @JsonProperty("phone")
    @CsvBindByName(column = "phone")
    private String phone;

}
