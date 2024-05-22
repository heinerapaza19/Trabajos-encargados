
package pe.edu.upeu.syscenterlife.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import pe.edu.upeu.syscenterlife.modelo.CompCarrito;
import pe.edu.upeu.syscenterlife.repositorio.CompCarritoRepository;

@Service
public class CompCarritoService {

    @Autowired
    private CompCarritoRepository compCarritoRepository;

    public CompCarrito guardarCompCarrito(CompCarrito compCarrito) {
        return compCarritoRepository.save(compCarrito);
    }

    public List<CompCarrito> obtenerTodosLosCompCarritos() {
        return compCarritoRepository.findAll();
    }

    public Optional<CompCarrito> obtenerCompCarritoPorId(Integer id) {
        return compCarritoRepository.findById(id);
    }

    public CompCarrito actualizarCompCarrito(CompCarrito compCarrito) {
        return compCarritoRepository.save(compCarrito);
    }

    public void eliminarCompCarritoPorId(Integer id) {
        compCarritoRepository.deleteById(id);
    }
}
