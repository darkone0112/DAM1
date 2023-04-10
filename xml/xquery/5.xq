for $sucursal in /sucursales/sucursal[@codigo]
let $max := max(/$sucursal/cuenta/saldodebe)
return
<sucursal>
  <cod>{data($sucursal/[@codigo])}</cod>
  <maximo>{data($max)}</maximo>
  <nombre>{data($sucursal/cuenta[saldodebe=$max]/nombre)}</nombre>
</sucursal>