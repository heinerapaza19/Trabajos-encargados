
package pe.edu.upeu.syscenterlife.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import pe.edu.upeu.syscenterlife.modelo.CompraDetalle;
import pe.edu.upeu.syscenterlife.repositorio.CompraDetalleRepository;

@Service
public class CompraDetalleService {

    @Autowired
    private CompraDetalleRepository compraDetalleRepository;

    public CompraDetalle guardarCompraDetalle(CompraDetalle compraDetalle) {
        return compraDetalleRepository.save(compraDetalle);
    }

    public List<CompraDetalle> obtenerTodosLosCompraDetalles() {
        return compraDetalleRepository.findAll();
    }

    public Optional<CompraDetalle> obtenerCompraDetallePorId(Integer id) {
        return compraDetalleRepository.findById(id);
    }

    public CompraDetalle actualizarCompraDetalle(CompraDetalle compraDetalle) {
        return compraDetalleRepository.save(compraDetalle);
    }

    public void eliminarCompraDetallePorId(Integer id) {
        compraDetalleRepository.deleteById(id);
    }
}

