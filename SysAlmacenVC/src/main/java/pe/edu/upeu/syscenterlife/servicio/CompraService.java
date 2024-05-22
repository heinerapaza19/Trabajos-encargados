
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import pe.edu.upeu.syscenterlife.modelo.Compra;
import pe.edu.upeu.syscenterlife.repositorio.CompraRepository;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public Compra guardarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public List<Compra> obtenerTodasLasCompras() {
        return compraRepository.findAll();
    }

    public Optional<Compra> obtenerCompraPorId(Integer id) {
        return compraRepository.findById(id);
    }

    public Compra actualizarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public void eliminarCompraPorId(Integer id) {
        compraRepository.deleteById(id);
    }
}

