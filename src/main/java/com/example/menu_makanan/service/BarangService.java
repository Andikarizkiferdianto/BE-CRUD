//package com.example.menu_makanan.service;
//
//
//import com.example.menu_makanan.exception.NotFoundException;
//import com.example.menu_makanan.model.Barang;
//import com.example.menu_makanan.repository.BarangRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class BarangService {
//
//    @Autowired
//    BarangRepository barangRepository;
//
//    public Barang add(Barang barang) {
//        return barangRepository.save(barang);
//    }
//
//    public Barang get(Long id) {
//        return barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
//    }
//
//    public List<Barang> getAll() {
//        return barangRepository.findAll();
//    }
//
//    public Barang edit(Long id, Barang barang) {
//        Barang update = barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
//        update.setNamabarang(barang.getNamabarang());
//        update.setStokbarang(barang.getStokbarang());
//        update.setDeskripsibarang(barang.getDeskripsibarang());
//        update.setJenisbarang(barang.getJenisbarang());
//        update.setTanggalkadaluarsa(barang.getTanggalkadaluarsa());
//        update.setHargabarang(barang.getHargabarang());
//        return barangRepository.save(update);
//    }
//
//    public Map<String, Boolean> delete(Long id) {
//        try {
//            barangRepository.deleteById(id);
//            Map<String, Boolean> res = new HashMap<>();
//            res.put("Deleted", Boolean.TRUE);
//            return res;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//}
