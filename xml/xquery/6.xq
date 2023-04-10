for $nombre in /productos/produc
for $zona in /zonas
return
<productos>
  <nombre>{data($nombre/denominacion)}
  </nombre>
  <zonas>{data($zona/zona[cod_zona = $nombre/cod_zona]/cod_zona)}</zonas>
</productos>