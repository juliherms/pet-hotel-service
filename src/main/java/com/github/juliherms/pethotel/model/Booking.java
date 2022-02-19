package com.github.juliherms.pethotel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_BOOKING")
@Data
@NoArgsConstructor
public class Booking implements Serializable {
    private  static  final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 30)
    private String petName;

    @Column(nullable = false,length = 70)
    private String breed;

    @Column(nullable = false,length = 100)
    private String responsible;

    @Column(nullable = false)
    private LocalDateTime registration;

}
