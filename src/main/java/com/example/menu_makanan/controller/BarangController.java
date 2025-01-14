//package com.example.menu_makanan.controller;
//
//
//import com.example.menu_makanan.exception.CommonResponse;
//import com.example.menu_makanan.exception.ResponseHelper;
//import com.example.menu_makanan.model.Barang;
//import com.example.menu_makanan.service.BarangService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/barang")
//@CrossOrigin(origins = "*")
//public class BarangController {
//
//    @Autowired
//    private BarangService barangService;
//
//    @PostMapping("/add")
//    public CommonResponse<Barang> add(@RequestBody Barang barang) {
//        return ResponseHelper.ok(barangService.add(barang));
//    }
//
//    @GetMapping("/{id}")
//    public CommonResponse<Barang> get(@PathVariable("id") Long id) {
//        return ResponseHelper.ok(barangService.get(id));
//    }
//
//    @GetMapping
//    public CommonResponse<List<Barang>> getAll() {
//        return ResponseHelper.ok(barangService.getAll());
//    }
//
//    @PutMapping("/{id}")
//    public CommonResponse<Barang> put(@PathVariable("id") Long id, @RequestBody Barang barang) {
//        return ResponseHelper.ok(barangService.edit(id, barang));
//    }
//
//    @DeleteMapping("/{id}")
//    public CommonResponse<?> delete(@PathVariable("id") Long id) {
//        return ResponseHelper.ok(barangService.delete(id));
//    }
//}
