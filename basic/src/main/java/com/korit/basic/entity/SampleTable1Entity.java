package com.korit.basic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Entity : RDBMS의 테이블과 매핑되는 ORM(JPA)의 클래스
// - 웹 애플리케이션 서버에서 데이터베이스 서버와 데이터 전송 및 관리를 위한 객체

// @Entity:
// - 해당 클래스를 Entity 클래스로 지정하는 어노테이션
// - JPA에서 데이터 관리를 위해 사용되는 주된 객체
// - name 속성: Entity를 사용할 때 이름을 지정할 수 있음
// Entity만으로는 의미가 없음

// @Table
// - 해당 Entity 클래스를 RDBMS의 테이블과 매핑하는 어노테이션
// - 만약 java의 클래스 명과 RDBMS의 테이블 명이 동일하다면 유추하여 매핑
// - name 속성: 클래스명과 테이블명이 서로 다를 때 테이블 명을 직접 명시하는 속성

@Entity(name="sample_table_1")  // java에서 사용할 이름
@Table(name="sample_table_1")   // 실제 DBMS의 이름을 명시
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SampleTable1Entity {
    
    // @Column
    // - 해당 멤버 변수를 테이블의 컬럼과 매핑하는 어노테이션
    // - name 속성 : 매핑할 컬럼명
    // - nullable 속성 : null 포함 여부
    // - unique 속성 : unique 제약 여부
    // - length 속성 : 컬럼의 길이

    @Column(name="pk_column", nullable=false, unique=true, length=20)
    @Id
    private String pkColumn;

    // @Id:
    // - Entity의 멤버 변수 중 PRIMARY KEY로 지정할 멤버 변수에 사용하는 어노테이션
    // - JPA에서는 @Id로 지정된 멤버 변수가 반드시 하나 이상 존재해야함

    @Column(name = "sample_colomn_1")
    private Integer sampleColumn1;

    @Column(name = "sample_column_2")
    private Boolean sampleColumn2;
}

// @ManyToOne, @OneToMany, @OneToOne... 관계를 위한 어노테이션도 존재함
// 관계관련 어노테이션을 사용하면 성능이 기하급수적으로 떨어짐(Entity 하나 값만 원하는데 위의 어노테이션을 사용하면 ENtity와 관련된 모든 테이블이 딸려와서 성능이 떨어짐)
// application.properties에 spring.jpa.hibernate.ddl-auto 속성으로
// ENtity 클래스에 해당하는 테이블을 DBMS에 자동으로 생성되게 할 수 있음