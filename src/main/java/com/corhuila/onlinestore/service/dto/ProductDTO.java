package com.corhuila.onlinestore.service.dto;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Lob;
import com.corhuila.onlinestore.domain.enumeration.Size;

/**
 * A DTO for the {@link com.corhuila.onlinestore.domain.Product} entity.
 */
@ApiModel(description = "Product sold by the Online store")
public class ProductDTO implements Serializable {
    
    private Long id;

    @NotNull
    private String name;

    private String descripcion;

    private BigDecimal price;

    @NotNull
    private Size size;

    @Lob
    private byte[] image;

    private String imageContentType;

    private Long productCategoryId;

    private String productCategoryNombre;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryNombre() {
        return productCategoryNombre;
    }

    public void setProductCategoryNombre(String productCategoryNombre) {
        this.productCategoryNombre = productCategoryNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductDTO productDTO = (ProductDTO) o;
        if (productDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), productDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", price=" + getPrice() +
            ", size='" + getSize() + "'" +
            ", image='" + getImage() + "'" +
            ", productCategoryId=" + getProductCategoryId() +
            ", productCategoryNombre='" + getProductCategoryNombre() + "'" +
            "}";
    }
}
