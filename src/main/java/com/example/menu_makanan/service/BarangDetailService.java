//package com.example.menu_makanan.service;
//
//import com.example.menu_makanan.exception.NotFoundException;
//import com.example.menu_makanan.model.Barang;
//import com.example.menu_makanan.repository.BarangRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BarangDetailService {
//
//    @Autowired
//    private BarangRepository barangRepository;
//
//    public BarangDetail getBarangDetail(Long id) {
//        Barang barang = barangRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("Barang not found with id: " + id));
//
//        return new BarangDetail(
//                barang.getId(),
//                barang.getNamabarang(),
//                barang.getStokbarang(),
//                barang.getDeskripsibarang(),
//                barang.getJenisbarang(),
//                barang.getTanggalkadaluarsa(),
//                barang.getHargabarang()
//        );
//    }
//
//    public List<Barang> getAllBarang() {
//        return barangRepository.findAll();
//    }
//}
