package com.korit.basic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="sample_table_2")
// Entity 클래스는 완벽한 캡슐화를 지향, 권장
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SampleTable2Entity {
    
    @Id
    // @GeneratedValue:
    // - PRIMARY KEY에 값을 자동 생성하는 전략을 지정해주는 어노테이션
    // - strategy 속성 : 자동 생성 전략을 지정
    // - GenerationType.AUTO: JPA가 적절한 생성 전략을 지정
    // - GenerationType.IDENTITY: auto increment 전략 선택
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aiPK;

    @Column
    private String sampleColumn;
}
