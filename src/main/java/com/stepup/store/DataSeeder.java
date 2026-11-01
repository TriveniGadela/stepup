package com.stepup.store;

import com.stepup.store.model.Product;
import com.stepup.store.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository repo;

    public DataSeeder(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        if (repo.count() > 0) return;

        // ── SNEAKERS ──────────────────────────────────────────────────────────
        repo.save(new Product("Air Glide Runner", "Nike", "Sneakers", 4999, 6499, 23,
                "4,5,6,7,8", "White,Pink,Black", 4.7, 50,
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600",
                "Lightweight mesh upper with responsive cushioning. Perfect for daily runs and casual wear."));

        repo.save(new Product("Cloud Stride Pro", "Adidas", "Sneakers", 5499, 6999, 21,
                "4,5,6,7,8", "White,Grey,Lavender", 4.6, 40,
                "https://images.unsplash.com/photo-1595950653106-6c9ebd614d3a?w=600",
                "Boost midsole technology for all-day energy return. Breathable knit upper."));

        repo.save(new Product("Velvet Kick Low", "Puma", "Sneakers", 3299, 3999, 18,
                "4,5,6,7,8", "Blush,White,Navy", 4.4, 60,
                "https://images.unsplash.com/photo-1600185365483-26d7a4cc7519?w=600",
                "Suede-inspired low-top sneaker with cushioned insole. Versatile everyday style."));

        repo.save(new Product("Flex Bloom Trainer", "Reebok", "Sneakers", 3799, 4499, 16,
                "5,6,7,8", "Coral,White,Mint", 4.3, 35,
                "https://images.unsplash.com/photo-1608231387042-66d1773070a5?w=600",
                "Flexible grooves for natural movement. Ideal for gym sessions and light training."));

        // ── HIGH HEELS ────────────────────────────────────────────────────────
        repo.save(new Product("Scarlet Stiletto", "Steve Madden", "High Heels", 3499, 4299, 19,
                "4,5,6,7", "Red,Black,Nude", 4.5, 30,
                "https://images.unsplash.com/photo-1543163521-1bf539c55dd2?w=600",
                "Classic pointed-toe stiletto with 4-inch heel. Faux leather upper with padded insole."));

        repo.save(new Product("Ivory Block Heel", "Zara", "High Heels", 2799, 3499, 20,
                "4,5,6,7,8", "Ivory,Beige,Black", 4.4, 45,
                "https://images.unsplash.com/photo-1515347619252-60a4bf4fff4f?w=600",
                "Comfortable 3-inch block heel with ankle strap. Perfect for office and evening wear."));

        repo.save(new Product("Glam Peep Toe", "Nine West", "High Heels", 3199, 3999, 20,
                "5,6,7,8", "Gold,Silver,Black", 4.3, 25,
                "https://images.unsplash.com/photo-1518049362265-d5b2a6467637?w=600",
                "Metallic peep-toe pump with kitten heel. Embellished strap adds a glamorous touch."));

        repo.save(new Product("Velvet Pump Classic", "Charles & Keith", "High Heels", 2499, 2999, 17,
                "4,5,6,7,8", "Burgundy,Navy,Black", 4.2, 55,
                "https://images.unsplash.com/photo-1596703263926-eb0762ee17e4?w=600",
                "Velvet finish court pump with 3.5-inch heel. Cushioned footbed for extended wear."));

        // ── SANDALS ───────────────────────────────────────────────────────────
        repo.save(new Product("Boho Strappy Sandal", "Birkenstock", "Sandals", 2999, 3599, 17,
                "4,5,6,7,8", "Tan,Brown,Black", 4.6, 70,
                "https://images.unsplash.com/photo-1603487742131-4160ec999306?w=600",
                "Anatomically shaped cork footbed with adjustable straps. Ultimate comfort for all-day wear."));

        repo.save(new Product("Coastal Slide", "Havaianas", "Sandals", 999, 1299, 23,
                "4,5,6,7,8", "Pink,Blue,White,Yellow", 4.3, 100,
                "https://images.unsplash.com/photo-1562183241-b937e95585b6?w=600",
                "Lightweight rubber slide with textured footbed. Waterproof and perfect for beach days."));

        repo.save(new Product("Gladiator Lace-Up", "Clarks", "Sandals", 2499, 2999, 17,
                "4,5,6,7,8", "Tan,Black,White", 4.4, 40,
                "https://images.unsplash.com/photo-1515347619252-60a4bf4fff4f?w=600",
                "Multi-strap gladiator sandal with cushioned sole. Adjustable ankle closure for perfect fit."));

        repo.save(new Product("Espadrille Wedge Sandal", "Toms", "Sandals", 1999, 2499, 20,
                "5,6,7,8", "Natural,Navy,Blush", 4.5, 50,
                "https://images.unsplash.com/photo-1603487742131-4160ec999306?w=600",
                "Jute-wrapped wedge with canvas upper. Comfortable 2-inch lift with cushioned insole."));

        // ── FLATS ─────────────────────────────────────────────────────────────
        repo.save(new Product("Ballet Bliss Flat", "Bata", "Flats", 1299, 1599, 19,
                "4,5,6,7,8", "Nude,Black,Red,Pink", 4.5, 80,
                "https://images.unsplash.com/photo-1560769629-975ec94e6a86?w=600",
                "Classic ballet flat with soft faux leather upper. Flexible sole and cushioned insole."));

        repo.save(new Product("Loafer Luxe", "Mochi", "Flats", 1799, 2199, 18,
                "4,5,6,7,8", "Black,Brown,Tan,White", 4.4, 65,
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600",
                "Slip-on loafer with metallic bit detail. Padded collar and cushioned footbed."));

        repo.save(new Product("Pointed Toe Flat", "Aldo", "Flats", 2199, 2699, 19,
                "4,5,6,7,8", "Black,Nude,Blush", 4.3, 45,
                "https://images.unsplash.com/photo-1560769629-975ec94e6a86?w=600",
                "Sleek pointed-toe flat with slim profile. Faux suede upper with non-slip sole."));

        repo.save(new Product("Bow Tie Flat", "Catwalk", "Flats", 1499, 1799, 17,
                "4,5,6,7,8", "Pink,Black,White", 4.2, 55,
                "https://images.unsplash.com/photo-1543163521-1bf539c55dd2?w=600",
                "Adorable bow-detail flat with soft lining. Perfect for casual and semi-formal occasions."));

        // ── BOOTS ─────────────────────────────────────────────────────────────
        repo.save(new Product("Chelsea Ankle Boot", "Dr. Martens", "Boots", 6999, 8499, 18,
                "4,5,6,7,8", "Black,Brown,Tan", 4.8, 30,
                "https://images.unsplash.com/photo-1608256246200-53e635b5b65f?w=600",
                "Iconic Chelsea boot with elastic side panels. Durable leather upper with air-cushioned sole."));

        repo.save(new Product("Knee High Riding Boot", "Clarks", "Boots", 5499, 6999, 21,
                "4,5,6,7,8", "Black,Brown,Cognac", 4.6, 25,
                "https://images.unsplash.com/photo-1608256246200-53e635b5b65f?w=600",
                "Tall riding boot with inside zip. Smooth leather upper with low stacked heel."));

        repo.save(new Product("Lace-Up Combat Boot", "Timberland", "Boots", 7499, 8999, 17,
                "4,5,6,7,8", "Black,Wheat,Grey", 4.7, 20,
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600",
                "Rugged lace-up boot with waterproof leather. Lug sole for superior grip and durability."));

        repo.save(new Product("Suede Ankle Bootie", "Nine West", "Boots", 3999, 4799, 17,
                "4,5,6,7,8", "Taupe,Black,Burgundy", 4.4, 35,
                "https://images.unsplash.com/photo-1608256246200-53e635b5b65f?w=600",
                "Soft suede ankle bootie with block heel. Side zip entry and cushioned insole."));

        // ── WEDGES ────────────────────────────────────────────────────────────
        repo.save(new Product("Cork Wedge Espadrille", "Sorel", "Wedges", 3299, 3999, 18,
                "4,5,6,7,8", "Natural,Black,White", 4.5, 40,
                "https://images.unsplash.com/photo-1515347619252-60a4bf4fff4f?w=600",
                "Woven canvas upper with cork-wrapped wedge. 3-inch heel with ankle tie closure."));

        repo.save(new Product("Platform Wedge Sandal", "Steve Madden", "Wedges", 3799, 4599, 17,
                "4,5,6,7,8", "Black,Nude,Leopard", 4.4, 35,
                "https://images.unsplash.com/photo-1603487742131-4160ec999306?w=600",
                "Strappy platform wedge with 4-inch heel. Adjustable ankle strap for secure fit."));

        repo.save(new Product("Wedge Sneaker", "Skechers", "Wedges", 2999, 3599, 17,
                "4,5,6,7,8", "White,Black,Rose Gold", 4.3, 50,
                "https://images.unsplash.com/photo-1595950653106-6c9ebd614d3a?w=600",
                "Hidden wedge sneaker with memory foam insole. Slip-on design with elastic laces."));

        repo.save(new Product("Wooden Wedge Mule", "Zara", "Wedges", 2499, 2999, 17,
                "4,5,6,7,8", "Tan,Black,White", 4.2, 45,
                "https://images.unsplash.com/photo-1562183241-b937e95585b6?w=600",
                "Open-toe mule with wooden wedge heel. Leather upper with padded footbed."));

        // ── CASUAL SHOES ──────────────────────────────────────────────────────
        repo.save(new Product("Canvas Slip-On", "Vans", "Casual Shoes", 2499, 2999, 17,
                "4,5,6,7,8", "White,Black,Checkerboard,Pink", 4.6, 75,
                "https://images.unsplash.com/photo-1600185365483-26d7a4cc7519?w=600",
                "Classic canvas slip-on with elastic side accents. Waffle outsole for grip and flexibility."));

        repo.save(new Product("Moccasin Comfort", "Clarks", "Casual Shoes", 2199, 2699, 19,
                "4,5,6,7,8", "Tan,Brown,Black", 4.5, 60,
                "https://images.unsplash.com/photo-1560769629-975ec94e6a86?w=600",
                "Soft leather moccasin with hand-stitched detail. Cushioned footbed for all-day comfort."));

        repo.save(new Product("Knit Slip-On Sneaker", "Skechers", "Casual Shoes", 2799, 3299, 15,
                "4,5,6,7,8", "Grey,Navy,Blush,White", 4.4, 55,
                "https://images.unsplash.com/photo-1608231387042-66d1773070a5?w=600",
                "Breathable knit upper with memory foam insole. Lightweight and flexible for everyday wear."));

        repo.save(new Product("Oxford Lace-Up", "Bata", "Casual Shoes", 1999, 2399, 17,
                "4,5,6,7,8", "White,Black,Tan", 4.3, 50,
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=600",
                "Classic oxford with lace-up closure. Smooth faux leather upper with cushioned insole."));
    }
}
