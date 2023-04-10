let $stock := 5
for $producto in /productos/produc[stock_minimo >= $stock]
let $zona := /zonas
return
<productos>
<nombre>{data($producto/denominacion)}</nombre>
<stock>{data($producto[stock_minimo >= $stock]/stock_minimo)}</stock>
<zona>{data($zona/zona[cod_zona = $producto/cod_zona]/cod_zona)}</zona>
</productos>