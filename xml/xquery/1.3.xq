for $zona in /zonas/zona
let $productos := /productos/produc
return
<zonas>
  <nombre>{data($zona/nombre)}</nombre>
  <codigo>{data($zona/cod_zona)}</codigo>
  <menor>{data(min($productos[cod_zona = $zona/cod_zona]/stock_minimo))}</menor>
</zonas>