package br.com.fiap.Ovni.Ovni;

import java.time.LocalDateTime;

import br.com.fiap.Ovni.Ovni.Enum.ShapeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ovni {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String location;
    private LocalDateTime data;
    private ShapeType shape;
    private String color;
    private int quant;
}
