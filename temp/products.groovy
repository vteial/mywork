import groovy.transform.Canonical

@CrossOrigin()
@RestController
@RequestMapping("/api/products")
class WebApplication {

    long counter = 0

    List<Product> items

    @PostConstruct
    void init() {
        items = [] as Product[]
    }

    @GetMapping("")
    List<Product> list() { return this.items }

    @GetMapping("/{id}")
    Product findById(@PathVariable Long id) { return this.items.find{ it.id == id } }

    @PostMapping("")
    Product post(@RequestBody Product item) {
        this.counter++
        item.id = this.counter
        this.items << item;
        return item;
    }

    @PutMapping("/{id}")
    Product put(@PathVariable Long id, @RequestBody Product item) {
        var eitem = this.items.find{ it.id == id }
        if(eitem) {
            eitem.code = item.code
            eitem.name = item.name
            eitem.unit = item.unit
            eitem.rate = item.rate
        }
        return eitem
    }

    @PatchMapping("/{id}")
    Product patch(@PathVariable Long id, @RequestBody Product item) {
        var eitem = this.items.find{ it.id == id }
        if(eitem) {
            if(item.code) eitem.code = item.code
            if(item.name) eitem.name = item.name
            if(item.unit) eitem.unit = item.unit
            if(item.rate) eitem.rate = item.rate
        }
        return eitem
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { this.items.removeIf{it.id == id } }

    @DeleteMapping("")
    void deleteAll() { this.items.clear() }

}

@Canonical
class Product {

    long id

    String code

    String name

    float unit

    float rate
}