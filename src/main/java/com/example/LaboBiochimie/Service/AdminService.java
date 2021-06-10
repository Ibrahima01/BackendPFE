package com.example.LaboBiochimie.Service;

import com.example.LaboBiochimie.Entities.Admin;
import com.example.LaboBiochimie.Entities.AppUser;
import org.springframework.security.core.userdetails.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface AdminService {
    void SaveAdmin (Admin admin);
    void UpdateAdmin (Long Id, Admin admin);
    List<Admin> ListAdmin();
    void RemoveAdmin (Long Id);
    public Optional<Admin> findAdmin (Long Id);
    public Optional<Admin> findAdminByUser(AppUser user );
}
