package com.main.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Categories")
public class Category implements Serializable {

	@Id
	@NotBlank(message = "Category ID must not be empty!")
	String id;
	@NotBlank(message = "Category name must not be empty!")
	@Column(columnDefinition = "nvarchar(50)")
	String name;
	@OneToMany(mappedBy = "category")
	List<Product> products;
}
