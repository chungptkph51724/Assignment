package P2;
import com.example.ph51724_24062025.P2.SanPham;
import com.example.ph51724_24062025.P2.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class P2Test {
    private SanPhamService service;

    @BeforeEach
    public void setUp() {
        service = new SanPhamService();
    }


    @Test
    public void testSuaHopLe() {
        SanPham sp = new SanPham("Sp01", "Chung", 20, 7.5f, 2, "sp1");
        service.them(sp);
        SanPham svMoi = new SanPham("Sp01", "Chung Updated", 22, 8.5f, 4, "sp3");
        assertTrue(service.sua(svMoi));
    }

    @Test
    public void testSuaKhongTonTai() {
        SanPham sp = new SanPham("Sp999", "Bảo", 21, 6.0f, 1, "sp2");
        assertFalse(service.sua(sp));
    }

    @Test
    public void testSuaTenRong() {
        SanPham sp = new SanPham("Sp01", "Chung", 20, 7.5f, 2, "sp4");
        service.them(sp);
        SanPham svMoi = new SanPham("Sp01", "", 20, 7.5f, 2, "sp4");
        assertFalse(service.sua(svMoi));
    }

    @Test
    public void testSuaTenNull() {
        SanPham sp = new SanPham("Sp01", "Chung", 20, 7.5f, 2, "sp1");
        service.them(sp);
        SanPham svMoi = new SanPham("Sp01", null, 21, 8.0f, 3, "sp1");
        assertFalse(service.sua(svMoi));
    }

    @Test
    public void testSuaDungMaSaiTen() {
        SanPham sv = new SanPham("Sp03", "Bình", 22, 6.8f, 2, "sp1");
        service.them(sv);
        SanPham svMoi = new SanPham("Sp03", "    ", 22, 6.8f, 2, "sp1");
        assertFalse(service.sua(svMoi));
    }


}

